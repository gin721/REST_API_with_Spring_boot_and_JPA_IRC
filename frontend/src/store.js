import { configureStore } from "@reduxjs/toolkit";
import { setupListeners } from "@reduxjs/toolkit/dist/query";
import ProductSlice from "./features/product/ProductSlice";
import CategorySlice from "./features/category/CategorySlice";
import CartSlice from "./features/cart/CartSlice";

let initialState = {};
let store = configureStore(
  {
    reducer: {
      categories: CategorySlice,
      products: ProductSlice,
      carts: CartSlice,
    },
  },
  initialState,
  window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__()
);

setupListeners(store.dispatch);

export default store;
