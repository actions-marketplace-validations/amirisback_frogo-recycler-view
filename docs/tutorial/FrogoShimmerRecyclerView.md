# Tutorial How To Use FrogoShimmerRecyclerView
This is the procedure for using frogo-recyclerview

# Usage (How to use this project)
Just following the step until finish, for basic adapter using step 2, for multi adapter using step 3
    
### Step 1. Create xml view
    
    <com.frogobox.recycler.widget.FrogoRecyclerView
        android:id="@+id/recycler_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
    	 	
    	 	
### Step 2. Setup shimmer-recycler-view

    private fun setupShimmerLoading() {
        activityKotlinShimmerBinding.rvShimmer.defineShimmerView()
            .addShimmerSumOfItemLoading(5)
            .addShimmerViewPlaceHolder(R.layout.frogo_rv_list_type_1)
            .createLayoutLinearVertical(false)
            .build()
    }

### Step 3. Setup shimmer-recycler-view data

    private fun setupFrogoShimmerRecyclerView(data: List<Article>) {

        val adapterCallback = object :
            FrogoViewAdapterCallback<Article> {
            override fun setupInitComponent(view: View, data: Article) {
                // Init component content item recyclerview
                view.findViewById<TextView>(R.id.frogo_rv_list_type_1_tv_title).text = data.title
            }

            override fun onItemClicked(data: Article) {
                // setup item clicked on frogo recycler view
                data.title?.let { showToast(it) }
            }

            override fun onItemLongClicked(data: Article) {
                // setup item long clicked on frogo recycler view
                data.title?.let { showToast(it) }
            }
        }

        activityKotlinShimmerBinding.rvShimmer.defineRecyclerView<Article>()
            .addData(data)
            .addCustomView(R.layout.frogo_rv_list_type_1)
            .addEmptyView(null)
            .addCallback(adapterCallback)
            .createLayoutLinearVertical(false)
            .build()
    }
    
### Step 4. Setup doing shimmer 

    private fun setupShimmer(state: Boolean) {
        if (state) {
            activityKotlinShimmerBinding.rvShimmer.startShimmer()
        } else {
            activityKotlinShimmerBinding.rvShimmer.stopShimmer()
        }
    }

# Sample Code
- Kotlin - https://github.com/amirisback/frogo-recycler-view/blob/master/app/src/main/java/com/frogobox/recycler/kotlinsample/KotlinShimmerActivity.kt
- Java - being developed