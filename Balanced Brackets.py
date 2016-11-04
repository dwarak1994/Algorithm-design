def bracket_matching(expr):
    lefty='{[('
    righty='}])'
    s=[]
    for c in expr:
        if c in lefty:
            s.append(c)
        elif c in righty:
            if len(s) is 0:
                return False
            if righty.index(c)!=lefty.index(s.pop()):
                return False
    return ( True)

k=bracket_matching('{[]}')
print(k)
