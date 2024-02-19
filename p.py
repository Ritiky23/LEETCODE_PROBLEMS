def pow(a,b):
    if b==1:
        return a
    return a*pow(a,b-1)

print(pow(2,6))