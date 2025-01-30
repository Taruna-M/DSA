class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQ = new LinkedList<>();
        for (int student : students) {
            studentQ.offer(student);
        }
        
        int i = 0; 
        int count = 0;
        
        while (count < studentQ.size() && i < sandwiches.length) {
            if (studentQ.peek() == sandwiches[i]) {
                studentQ.poll();
                i++;
                count = 0;
            } else {
                studentQ.offer(studentQ.poll());
                count++;
            }
        }
        
        return studentQ.size();
    }
}