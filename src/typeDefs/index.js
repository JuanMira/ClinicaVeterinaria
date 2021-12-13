//Se llama al typedef (esquema) de cada submodulo
const customerTypeDefs = require("./customer_type_defs");
const authTypeDefs = require("./auth_type_defs");
//Se unen
const schemasArrays = [authTypeDefs, customerTypeDefs];
//Se exportan
module.exports = schemasArrays;
