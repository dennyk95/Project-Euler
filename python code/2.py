a, b= 0, 1
even=0
while b<4000000:
  a,b = b, a+b
  if b%2 == 0:
    even=even+b
  print even