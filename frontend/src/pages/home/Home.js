import React, { Fragment } from "react";
import TopNavbar from "../../components/Header/TopNavbar";
import HeaderSlider from "../../components/Slider/HeaderSlider";
import AllCategories from "../../components/Categories/AllCategories";
import LatestProducts from "../../components/Product/LatestProducts";
import Footer from "../../components/Footer/Footer";

function Home() {
  return (
    <Fragment>
      <TopNavbar />
      <HeaderSlider />
      <AllCategories />
      <LatestProducts />
      <Footer />
    </Fragment>
  );
}

export default Home;

