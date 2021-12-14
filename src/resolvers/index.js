const customerResolver = require("./customer_resolver");
const authResolver = require("./auth_resolver");
const petsResolver = require("./pets_resolver");
const lodash = require("lodash");
const resolvers = lodash.merge(customerResolver, authResolver, petsResolver);
module.exports = resolvers;
