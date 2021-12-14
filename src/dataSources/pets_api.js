const { RESTDataSource } = require("apollo-datasource-rest");
const serverConfig = require("../server");
class PetsAPI extends RESTDataSource {
  constructor() {
    super();
    this.baseURL = serverConfig.pets_api_url;
  }
  async createPets(account) {
    account = new Object(JSON.parse(JSON.stringify(account)));
    return await this.post("pet", account);
  }
  async petsByidMascota(idMascota) {
    return await this.get(`pet/${idMascota}`);
  }
  async listPets() {
    return await this.get(`pet`);
  }

  async adoptPet(idPet, pet) {
    pet = new Object(JSON.parse(JSON.stringify(pet)));
    return await this.put(`pet/${idPet}`, pet);
  }

  async updatePet(idPet, pet) {
    pet = new Object(JSON.parse(JSON.stringify(pet)));
    console.log(pet);
    return await this.put(`pet/${idPet}`, pet);
  }
}
module.exports = PetsAPI;
