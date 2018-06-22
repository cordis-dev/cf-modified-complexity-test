# https://github.com/rubocop-hq/rubocop/blob/master/lib/rubocop/cop/metrics/cyclomatic_complexity.rb
# https://github.com/rubocop-hq/rubocop/blob/master/lib/rubocop/cop/metrics/perceived_complexity.rb
def method_name
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
