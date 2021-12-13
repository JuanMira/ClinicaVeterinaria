const customerResolver = require("./customer_resolver");
const authResolver = require("./auth_resolver");
const lodash = require("lodash");
const resolvers = lodash.merge(customerResolver, authResolver);
module.exports = resolvers;
