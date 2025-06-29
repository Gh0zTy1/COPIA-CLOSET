package equipo.closet.closetvirtual.ui.outfitCreation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import equipo.closet.closetvirtual.databinding.FragmentOutfitCreationBinding
import android.widget.ArrayAdapter
import equipo.closet.closetvirtual.R

class OutfitCreationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_outfit_creation, container, false)
    }

    /**
     * Initialize the fragment initialized variables here
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}
