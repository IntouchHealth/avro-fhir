require 'json'

Dir['/home/ubuntu/avro-fhir/schemas/*.avsc'].each do |filename|
  puts filename
  file = File.read(filename)
  hash = JSON.parse(file)
  File.open(filename, 'w') { |f| f.write(JSON.pretty_generate(hash)) }
end

