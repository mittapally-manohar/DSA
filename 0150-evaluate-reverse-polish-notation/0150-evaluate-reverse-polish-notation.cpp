class Solution {
public:
    int operate(const string &s,int &a,int &b){
        if(s=="+") return a+b;
        else if(s=="-") return b-a;
        else if(s=="*") return a*b;
        else if(s=="/") return b/a;
        else return -1;
    }
    int evalRPN(vector<string>& tokens) {
        stack<int>st;
        for(string &s:tokens){
            if(s=="+" || s=="-" || s=="*" || s=="/"){
                int operand1=st.top(); st.pop();
                int operand2=st.top(); st.pop();
                int ans=operate(s,operand1,operand2);
                st.push(ans);
            } else{
                st.push(stoi(s));
            }
        }
        return st.top();
    }
};