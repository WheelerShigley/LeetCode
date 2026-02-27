#include <string>
using std::string;
#include <algorithm>
using std::sort;
#include <iostream>
using std::cout;

class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
      //this will be easier if they're sorted
      sort( ransomNote.begin(),ransomNote.end() ); sort( magazine.begin(),magazine.end() );
      
      //look through each unique letter of the ransomNote, checking if it's in the magazine
      int magazine_start_pos = 0, ransom_start_pos = 0;
      char current = '\0', previous = '\0';
      
      //count amount of each character in each array
      int ransomCount[26] = {0}, magazineCount[26] = {0};
      for(int ransom_index = 0; ransom_index < ransomNote.size(); ransom_index++) {
         ransomCount[ (int)ransomNote[ransom_index]-97 ]++; //assuming lowercase
      }
      for(int magazine_index = 0; magazine_index < magazine.size(); magazine_index++) {
         magazineCount[ (int)magazine[magazine_index]-97 ]++; //assuming lowercase
      }
      
      //compare arrays, if magazine ever has less than needed, return false
      for(int pos = 0; pos < 26; pos++) {
         if( magazineCount[pos] < ransomCount[pos] ) { return false; }
      }
      
      //if nothing was wrong, return allowed!
      return true;
    }
};

int main() {
   //instance variable
   Solution solutionInstance;
   
   //example tests
   cout << solutionInstance.canConstruct("abfafzte","abfafte") << "\n";

return 0;  }