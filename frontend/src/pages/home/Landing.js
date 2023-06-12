import React from 'react'
import image1 from '../../static/bg1.jpg'
import image2 from '../../static/bg2.jpg'
import image3 from '../../static/bg3.jpg'
import image4 from '../../static/bg4.jpg'

export default function Landing() {
    
  return (
    <div>
        <div className="text-gray-700 bg-white antialiased">
  <nav className="flex items-center justify-between flex-wrap p-6">
      
      <div className="flex items-center flex-shrink-0 text-dark md:text-right mr-6">
        <span className="font-semibold text-xl tracking-tight hover:text-green-800"><a href="/">Shopify</a></span>
      </div>
      
      <div className="block lg:hidden">
        <button id="nav-toggle" className="flex items-center px-4 py-2 border rounded text-gray-500 border-gray-600 hover:text-gray-800 hover:border-teal-500 appearance-none focus:outline-none">
				<svg className="fill-current h-3 w-3" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
          <title>Menu</title>
          <path d="M0 3h20v2H0V3zm0 6h20v2H0V9zm0 6h20v2H0v-2z"/>
          </svg>
        </button>
      </div>
      
    <div id="nav-content" className="w-full flex-grow lg:flex lg:items-center lg:w-auto hidden pt-6 lg:pt-0 md:text-right">
      <div className="text-sm lg:flex-grow">
          <a href="/login" className="block mt-4 lg:inline-block lg:mt-0 text-dark-200 hover:text-teal-800 mr-4">Login</a>
       </div>
     </div>
      
  </nav>
   
  <div className="py-20 bg-cover bg-no-repeat bg-fixed" style={{ backgroundImage: `url(${image1})` }}>
    <div className="container m-auto text-center px-6 opacity-100">
      <h2 className="text-4xl font-bold mb-2 text-white">One stop place for online shopping</h2>
      <h3 className="text-2xl mb-8 text-gray-200">Your best place to shop online with wide range of products and instant delivery</h3>
      <a href='/login'>
        <button className="bg-white font-bold rounded-full py-4 px-8 shadow-lg uppercase tracking-wider hover:border-transparent hover:text-blue-500 hover:bg-gray-800 transition-all">Shop now</button>
      </a>
    </div>
  </div>
        
        <section className="container mx-auto px-6 p-10">
          <div className="flex items-center flex-wrap mb-20">
            <div className="w-full md:w-1/2 pr-10">
              <h4 className="text-3xl text-gray-800 font-bold ml-5 mb-3">Wide Range of Products</h4>
              <p className="text-gray-600 ml-5 mb-8">Their primary target will be the power generators. Prepare to open the shield. Sir, Rebel ships are coming into our sector. Good. Our first catch of the day. Stand by, ion control....Fire! The first transport is away.</p>
            </div>
            <div className="w-full md:w-1/2">
              <img className="rounded-lg" src={image2} alt='image2' />
            </div>
          </div>
          <div className="flex items-center flex-wrap mb-20">
            <div className="w-full md:w-1/2">
              <img className="rounded-lg" src={image4} alt="use the force" />
            </div>
            <div className="w-full md:w-1/2 pl-10">
              <h4 className="text-3xl text-gray-800 font-bold mb-3">Instant Delivery</h4>
              <p className="text-gray-600 mb-8">We'll never get it out now. So certain are you. Always with you it cannot be done. Hear you nothing that I say? Master, moving stones around is one thing. This is totally different. No! No different!</p>
            </div>
          </div>
          <div className="flex items-center flex-wrap mb-20">
            <div className="w-full md:w-1/2 pr-10">
              <h4 className="text-3xl text-gray-800 font-bold ml-5 mb-3">Friendly Customer Service</h4>
              <p className="text-gray-600 ml-5 mb-8">There is no try. I can't. It's too big. Size matters not. Look at me. Judge me by my size, do you? Hm? Mmmm. And well you should not. For my ally in the Force. And a powerful ally it is.</p>
            </div>
            <div className="w-full md:w-1/2">
              <img className="rounded-lg" src={image3} alt="Syncing" />
            </div>
          </div>
        </section>
        
        <section style={{backgroundColor:"#8EA1B5"}}>
          <div className="container mx-auto px-6 text-center py-20">
            <h2 className="mb-6 text-4xl font-bold text-center text-white">Need Help?</h2>
            <h3 className="my-4 text-2xl text-white">You could contact us anytime 24/7</h3>
            <button className="bg-white font-bold rounded-full mt-6 py-4 px-8 shadow-lg uppercase tracking-wider hover:border-red hover:text-white hover:bg-red-600">Contact Us</button>
          </div>
        </section>
        
        <footer className="bg-gray-100">
          <div className="container mx-auto px-6 pt-10 pb-6">
            <div className="flex flex-wrap">
              <div className="w-full md:w-1/4 text-center md:text-left ">
                <h5 className="uppercase mb-6 font-bold">Links</h5>
                <ul className="mb-4">
                  <li className="mt-2">
                    <a href="/" className="hover:underline text-gray-600 hover:text-orange-500">I'll return</a>
                  </li>
                  <li className="mt-2">
                    <a href="/" className="hover:underline text-gray-600 hover:text-orange-500">I promise</a>
                  </li>
                  <li className="mt-2">
                    <a href="/" className="hover:underline text-gray-600 hover:text-orange-500">Reckless is he</a>
                  </li>
                </ul>
              </div>
              <div className="w-full md:w-1/4 text-center md:text-left ">
                <h5 className="uppercase mb-6 font-bold">Legal</h5>
                <ul className="mb-4">
                  <li className="mt-2">
                    <a href="/" className="hover:underline text-gray-600 hover:text-orange-500">Emperor's Terms</a>
                  </li>
                  <li className="mt-2">
                    <a href="/" className="hover:underline text-gray-600 hover:text-orange-500">Pulverized?</a>
                  </li>
                </ul>
              </div>
              <div className="w-full md:w-1/4 text-center md:text-left ">
                <h5 className="uppercase mb-6 font-bold">Social</h5>
                <ul className="mb-4">
                  <li className="mt-2">
                    <a href="/" className="hover:underline text-gray-600 hover:text-orange-500">Corellia</a>
                  </li>
                  <li className="mt-2">
                    <a href="/" className="hover:underline text-gray-600 hover:text-orange-500">Bilbringi</a>
                  </li>
                  <li className="mt-2">
                    <a href="/" className="hover:underline text-gray-600 hover:text-orange-500">Fondor</a>
                  </li>
                </ul>
              </div>
              <div className="w-full md:w-1/4 text-center md:text-left ">
                <h5 className="uppercase mb-6 font-bold">Through the Force</h5>
                <ul className="mb-4">
                  <li className="mt-2">
                    <a href="/" className="hover:underline text-gray-600 hover:text-orange-500">Journey to the Emperor</a>
                  </li>
                  <li className="mt-2">
                    <a href="/" className="hover:underline text-gray-600 hover:text-orange-500">Lord Vader ship approaching?</a>
                  </li>
                  <li className="mt-2">
                    <a href="/" className="hover:underline text-gray-600 hover:text-orange-500">X-wing className</a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </footer>
      </div>
    </div>
  )
}
