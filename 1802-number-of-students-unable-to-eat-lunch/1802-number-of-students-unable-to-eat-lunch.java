class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int countzero=0,countone=0;
        for(int i=0;i<students.length;i++){
           if(students[i]==0)countzero++;
           else countone++;
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0&&countzero>0){
                countzero--;
            }
           else if(sandwiches[i]==1&&countone>0){
                countone--;
            }
            else{
                break;
            }
        }
        return countzero+countone;
    }
}