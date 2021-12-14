const petsResolver = {
  Query: {
    listPets: (_, __, { dataSources }) => dataSources.petsAPI.listPets(),
    petsByidMascota: async (_, { idPets }, { dataSources }) => {
      return await dataSources.petsAPI.petsByidMascota(idPets);
    },
  },
  Mutation: {
    createPets: async (_, { Customer }, { dataSources }) => {
      const petsInput = {
        nombreMascota: Customer.nombreMascota,
        raza: Customer.raza,
      };
      await dataSources.petsAPI.createPets(petsInput);
    },
    adoptPet: async (_, { idMascota, idCustomer }, { dataSources }) => {
      const adoptPet = {
        nombreMascota: "",
        raza: "",
        idCustomer: idCustomer,
      };
      await dataSources.petsAPI.adoptPet(idMascota, adoptPet);
    },
    updatePet: async (_, { idPet, Customer }, { dataSources }) => {
      const adoptPet = {
        nombreMascota: Customer.nombreMascota,
        raza: Customer.raza,
      };
      await dataSources.petsAPI.updatePet(idPet, adoptPet);
    },
  },
};
module.exports = petsResolver;
