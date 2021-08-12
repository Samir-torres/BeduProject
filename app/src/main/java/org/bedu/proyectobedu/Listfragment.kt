package org.bedu.proyectobedu


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*

class Listfragment : Fragment() {

    private lateinit var mAdapter: RecyclerAdapter
    private var listener: (Product) -> Unit = {}


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // infla el layout para este Fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    //generamos datos dummy con este método
    private fun getProducts(): MutableList<Product> {
        val products: MutableList<Product> = ArrayList()

        products.add(Product("Pan","pan multigrano","$1.50",4.6f,R.drawable.bread))
        products.add(Product("Queso", "manchego", "$98", 4.4f, R.drawable.chesse))
        products.add(Product("Coca", "sin azucar", "$22", 3.8f, R.drawable.coca))
        products.add(Product("Jugo","naranja","$6",4.8f,R.drawable.juice))
        products.add(Product("Carne","puerco","$60",4.8f,R.drawable.meat))
        products.add(Product("Leche","deslactosada","$49",4.8f,R.drawable.milk))
        products.add(Product("Arroz","blanco","$40",4.8f,R.drawable.rice))

        return products
    }

    //configuramos lo necesario para desplegar el RecyclerView
    private fun setUpRecyclerView() {
        // indicamos que tiene un tamaño fijo
        recyclerProducts.setHasFixedSize(true)
        // indicamos el tipo de layoutManager
        recyclerProducts.layoutManager = LinearLayoutManager(activity)
        //seteando el Adapter
        mAdapter = RecyclerAdapter(requireActivity(), getProducts(), listener)
        //asignando el Adapter al RecyclerView
        recyclerProducts.adapter = mAdapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpRecyclerView()
    }

    fun setListener(l: (Product) -> Unit) {
        listener = l
    }


}