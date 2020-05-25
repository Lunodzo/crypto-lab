int getch(void);
void ungetch(int);

//getint: get next integer from input to *pn
int getint(int *pn){
    int c, sign;

    while (isspace(c = getch()));//Skip white space
    if (!isDigit(c) && c!= EOF && c != '+' && c != '-')
    {
        ungetch(c); //It is not a number
        return 0;
    }

    sign = (c == '-') ? -1:1;
    if (c == '+' || c == '-')
    {
        c = getch();
        for (*pn = 0; isDigit(c);; c = getch())
        {
            *pn = 10 * *pn + (c - '0');
        }
        *pn *= sign;
        if (c != EOF)
        {
            ungetch(c);
        }
        return c;
    }
    
    
}
int main(int argc, char const *argv[])
{
    /* code */
    return 0;
}
