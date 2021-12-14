const { ApolloServer } = require("apollo-server");
const typeDefs = require("./typeDefs");
const resolvers = require("./resolvers");
const CustomerAPI = require("./dataSources/customer_api");
const PetsAPI = require("./dataSources/pets_api");
const AuthAPI = require("./dataSources/auth_api");
const authentication = require("./utils/authentication");
const server = new ApolloServer({
  context: authentication,
  typeDefs,
  resolvers,
  dataSources: () => ({
    customerAPI: new CustomerAPI(),
    authAPI: new AuthAPI(),
    petsAPI: new PetsAPI(),
  }),
  introspection: true,
  playground: true,
});
server.listen(process.env.PORT || 4000).then(({ url }) => {
  console.log(`🚀 Server ready at ${url}`);
});
