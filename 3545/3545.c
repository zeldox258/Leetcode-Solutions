bool minimumDeletionsForAtMostKDist(char* s) {
    char st[10001];
    int top = -1;
    for (int i = 0; s[i]; i++) {
        if (s[i] == '(' || s[i] == '[' || s[i] == '{') st[++top] = s[i];
        else {
            if (top < 0) return false;
            char p = st[top--];
            if (s[i] == ')' && p != '(' || s[i] == ']' && p != '[' || s[i] == '}' && p != '{') return false;
        }
    }
    return top == -1;
}