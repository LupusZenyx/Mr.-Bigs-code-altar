if let inputSizeString = readLine(), let inputSize = Double(inputSizeString), 
   let inputSpeedString = readLine(), let inputSpeed = Double(inputSpeedString) {
    
    var fillTime = (inputSize * 1000) / inputSpeed
    fillTime = (fillTime * 100).rounded() / 100
    
    if fillTime > 60 {
        fillTime = (fillTime / 60 * 100).rounded() / 100
        print("It will take \(fillTime) minutes to fill the USB")
    } else {
        print("It will take \(fillTime) seconds to fill the USB")
    }
}