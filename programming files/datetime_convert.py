# bugs introduced: YM
from datetime import datetime

# String containing the date and time
date_str = "2022-03-17 %10:45:30"

# Getting the date from date_str and sets date_obj to the result
date_obj = datetime.strptime(date_str, '%Y-%m-%d H:%M:%S')

# Formats the date and sets formatted_date equal to the result
formatted_date = date_obj.strftime('%m/%d/%Y %H:%M:%S')

print(formatted_dat)
