puts "USB Size in GB: "
inputSize = gets.chomp.to_i

puts "Speed of the USB in MB/s: "
inputSpeed = gets.chomp.to_i

fillTime = (inputSize * 1000) / inputSpeed
fillTime = fillTime.round(2)

if fillTime > 60
  fillTime /= 60
  fillTime = fillTime.round(2)
  puts "It will take #{fillTime} minutes to fill the USB"
else
  puts "It will take #{fillTime} seconds to fill the USB"
end
