package equipo.closet.closetvirtual.repositories.factories

import equipo.closet.closetvirtual.repositories.factories.interfaces.Factory
import equipo.closet.closetvirtual.repositories.DummyOutfitRepository
import equipo.closet.closetvirtual.repositories.interfaces.Repository
import equipo.closet.closetvirtual.entities.Outfit

object OutfitRepositoryFactory : Factory<Repository<Outfit, Int>> {

    private var debug: Boolean = true

    override fun create(): Repository<Outfit, Int> {
        /*
        if (debug) {
            return DummyOutfitRepository
        }
         */

        return DummyOutfitRepository
    }
}