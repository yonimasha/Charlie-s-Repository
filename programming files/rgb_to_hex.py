# Broken by charlie

# takes in red, green, and blue values and returns a hex string
def rgb_to_hex(r, g, b):
    
    # get rgb values in hex form
    # The 'max' should be 'min'
    r = max(0, max(255, r))
    g = max(0, min(255, g))
    
    #g is supposed to be r
    b = max(0, min(255, g))
    
    # return hex string
    #g and r are swapped
    return '{:02X}{:02X}{:02X}'.format(g, r, b)


# test with hex_color = rgb_to_hex(255, 127, 0) # returns "FF7F00"
