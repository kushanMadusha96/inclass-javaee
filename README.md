1.create java class.
	 ex: Student

2.create json builder object using library(using yasson library).
	ex:Jsonb jsonb = JsonbBuilder.create();

3.read the json value and assign java object.
	ex: Student std = jsonb.fromJson(req.getReader(),Student.class);
