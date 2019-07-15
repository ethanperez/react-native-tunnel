# `react-native-tunnel`
![Supports Android, iOS, and Windows](https://img.shields.io/badge/platforms-android%20-orange.svg) ![MIT License](https://img.shields.io/badge/license-MIT-yellowgreen.svg)

Allows React Native debug bundle to download from custom URL. Mainly created to allow reverse tunneling of Metro from a local host to a device running a React Native application without bothering with a cord or [adb](https://developer.android.com/studio/command-line/adb).

## Get Started
You can install `react-native-tunnel` with either Yarn or NPM

```js
// Yarn
yarn add --dev react-native-tunnel

// NPM
npm install --save-dev react-native-tunnel
```

If you're using React Native 0.60+, the library should [autolink](https://github.com/react-native-community/cli/blob/master/docs/autolinking.md), which means there is no further action required to set up the library.

All other versions of React Native require linking, but that should be as simple as the following command:

```js
react-native link react-native-tunnel
```

## Usage
`react-native-tunnel` simply allows you to tell the app to point somewhere other than `localhost:8081` for bundle download and debugging.

If you're looking for a way to reverse tunnel your local Metro server to the internet and give it a global address, you'll want to use a tunnel service like [ngrok](https://ngrok.com/).

To set the proper domain root, you only need to set the `RNTUNNEL_DOMAIN_URL` environment variable at build time. Here's an example script from a `package.json`

```js
"scripts": {
    "start": "react-native start",
    "run-android": "RNTUNNEL_DOMAIN_URL=reactnativetunnel.ngrok.io react-native run-android"
  },
```

## Next Tasks
- [ ] iOS support
- [ ] Command line utility to set URL
- [ ] Contribution guide

## License

The library is released under the MIT license. See the [`LICENSE`](/LICENSE).