int minimizedStringLength(char * s){
    int set[256] = {0}; // Initializing an array to simulate a set

    int length = 0;
    for (int i = 0; s[i] != '\0'; i++) {
        if (!set[s[i]]) {
            set[s[i]] = 1;
            length++;
        }
    }

    return length;
}