// Collections
// Fixed length List
// Growable List
// Set
// Map (HashMap) key - value pair, index is unique, value can be duplicate, not fixed

main(List<String> args) {
  // fixed length list, same as array, same as immutalbeList in kotlin
  List aList = List(8);
  aList[0] = 32;
  aList[2] = 354;
  aList[4] = 981;
  aList[1] = 12;
  // iterate with for loop
  for(int numbers in aList){
    print(numbers);
  }
  print("LINEBREAK----------LINEBREAK");
  // iterate with foreach loop
  aList.forEach((number) => print(number));

  print("Growable list");
  // growable list, just leave empty;
  List<String> nameList = List();
  nameList.add("Mark");
  nameList.add("Jenny");
  nameList.add("Awesome");
  nameList.insert(3, "eight");
  
  // iterate the whole nameList
  for(String name in nameList){
    print(name);
  }

  List<String> cities = ["Taunggyi", "Yangon", "Mandalay"];
  for(String city in cities){
    print(city);
  }

  // set ( is not ordered as List)
  // but not accept duplicate elements
  // set the elements from list
  Set<int> phoneNumbers = Set.from([095, 099, 0951, 0952, 094]);
  // set ordinary way
  Set<String> countries = Set();
  countries.add("Myanmar");
  countries.add("India");
  countries.add("Singnapore");
  countries.add("China");
  countries.add("Laos");
  countries.add("Thailand");
  countries.add("Japan");
  // iterate all country from countries set
  for(String country in countries){
    print(country);
  }

  print("MAP------------HASHMAP");
  // Map
  Map<int, String> contacts = Map();
  contacts[0952] = "Smith";
  contacts[0951] = "Jane";
  contacts[0955] = "Sarah";
  contacts[0922] = "Joe";
  // iterate all index from contacts
  for(var key in contacts.keys){
    print(key);
  }
  // iterate all values from contacts
  for(String name in contacts.values){
    print(name);
  }
  // iterate all keys and values from contacts
  contacts.forEach((key, value) => print("$key and $value"));
} 