function fn() {
  var faker = Java.type('com.github.javafaker.Faker');
  var nameGenerator = Java.type('resources.patients.PatientDataGenerator');
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'dev';
  }
  var config = {
    env: env,
    myVarName: 'someValue'
  }
  if (env == 'dev') {
    // customize
    // e.g. config.foo = 'bar';
  } else if (env == 'e2e') {
    // customize
  }
  config.faker = faker;
  config.nameGenerator = nameGenerator;
  return config;
}
