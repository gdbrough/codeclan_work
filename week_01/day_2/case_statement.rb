# puts "Enter number "
# score = gets.chomp
#
# result = case score.to_i()
#   when 10
#     "Genius."
#   when 8..9, 11..12
#     "Merit"
#   when 5..7, 12..15
#     "Pass"
#   else
#     "Fail"
# end
#
# puts result

# Guard
# score = 6
# result = "fail"
# result = "pass" if (score >= 6)
# puts result

# Ternary
# score = 6
# result = score > 5 ? "pass" : "fail"
# puts result

craig_hungry = true
craig_tired = true

puts "Craig is hangry" if craig_hungry && craig_tired

craig_tired = false

puts "Craig is grumpy" if craig_hungry || craig_tired
