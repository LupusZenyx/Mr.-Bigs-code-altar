inputSize = input("USB Size in GB ")
inputSize = int(inputSize)
inputSpeed = input("Speed of the USB in MB/s: ")
inputSpeed = int(inputSpeed)

fillTime = (inputSize * 1000) / inputSpeed
fillTime = round(fillTime, 2)

if fillTime > 60:
    fillTime = fillTime / 60
    fillTime = round(fillTime, 2)
    print("It will take " + str(fillTime) + " minutes to fill the USB")
else:
    print("It will take " + str(fillTime) + " seconds to fill the USB")