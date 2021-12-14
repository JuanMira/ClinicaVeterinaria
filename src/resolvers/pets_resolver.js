const petsResolver = {
  Query: {
    listPets: (_, __, { dataSources }) => dataSources.petsAPI.listPets(),
    petsByidMascota: async (_, { idPets }, { dataSources }) => {
      return await dataSources.petsAPI.petsByidMascota(idPets);
    },
  },
  Mutation: {
    createPets: async (_, { Pets }, { dataSources }) => {
      const petsInput = {
        idMascota: Pets.idMascota,
        nombreMascota: Pets.nombreMascota,
        raza: Pets.raza,
        idDueno: Pets.idDueno,
      };
      await dataSources.petsAPI.createPets(petsInput);
    },
  },
};
module.exports = petsResolver;
