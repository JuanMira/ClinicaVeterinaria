const { RESTDataSource } = require("apollo-datasource-rest");
const serverConfig = require("../server");
class CustomerAPI extends RESTDataSource {
  constructor() {
    super();
    this.baseURL = serverConfig.customer_api_url;
  }
  async createCustomer(account) {
    account = new Object(JSON.parse(JSON.stringify(account)));
    return await this.post("/account", account);
  }
  async customerByUsername(idUsuario) {
    return await this.get(`/account${idUsuario}/`);
  }
}
module.exports = CustomerAPI;
