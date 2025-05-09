# https://github.com/rubocop-hq/rubocop/blob/master/lib/rubocop/cop/metrics/cyclomatic_complexity.rb
# https://github.com/rubocop-hq/rubocop/blob/master/lib/rubocop/cop/metrics/perceived_complexity.rb
def if_elseif_test
  car = "Patriot"

  manufacturer =
    if car == "Focus"
      "Ford"
    elsif car == "Navigator"
      "Lincoln"
    elsif car == "Camry"
      "Toyota"
    elsif car == "Civic"
      "Honda"
    elsif car == "Patriot"
      "Jeep"
    elsif car == "Jetta"
      "VW"
    elsif car == "Ceyene"
      "Porsche"
    elsif car == "Outback"
      "Subaru"
    elsif car == "520i"
      "BMW"
    elsif car == "Tundra"
      "Nissan"
    else
      "Unknown"
    end

  manufacturer
end

def case_when_test
	car = "Patriot"

	manufacturer = case car
	   when "Focus" then "Ford"
	   when "Navigator" then "Lincoln"
	   when "Camry" then "Toyota"
	   when "Civic" then "Honda"
	   when "Patriot" then "Jeep"
	   when "Jetta" then "VW"
	   when "Ceyene" then "Porsche"
	   when "Outback" then "Subaru"
	   when "520i" then "BMW"
	   when "Tundra" then "Nissan"
	   else "Unknown"
	end
end
