package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.VideoPlayPause24: ImageVector
  get() {
    if (_videoPlayPause24 != null) {
      return _videoPlayPause24!!
    }
    _videoPlayPause24 = fluentIcon(name = "Filled.VideoPlayPause24", 24f) {
      materialPath {
          moveTo(12.0F, 7.75F)
          curveTo(12.0F, 6.784F, 12.784F, 6.0F, 13.75F, 6.0F)
          horizontalLineToRelative(1.5F)
          curveTo(16.216F, 6.0F, 17.0F, 6.784F, 17.0F, 7.75F)
          verticalLineToRelative(8.5F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineToRelative(-1.5F)
          curveTo(12.784F, 18.0F, 12.0F, 17.216F, 12.0F, 16.25F)
          verticalLineToRelative(-4.13F)
          curveToRelative(-0.024F, 0.55F, -0.304F, 1.092F, -0.84F, 1.417F)
          lineToRelative(-6.5F, 3.952F)
          curveTo(3.493F, 18.197F, 2.0F, 17.358F, 2.0F, 15.993F)
          verticalLineTo(8.004F)
          curveToRelative(0.0F, -1.372F, 1.507F, -2.21F, 2.673F, -1.486F)
          lineToRelative(6.502F, 4.037F)
          curveToRelative(0.526F, 0.327F, 0.8F, 0.862F, 0.825F, 1.408F)
          verticalLineTo(7.75F)
          close()
          moveToRelative(6.0F, 0.0F)
          curveTo(18.0F, 6.784F, 18.784F, 6.0F, 19.75F, 6.0F)
          horizontalLineToRelative(1.5F)
          curveTo(22.216F, 6.0F, 23.0F, 6.784F, 23.0F, 7.75F)
          verticalLineToRelative(8.5F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineToRelative(-1.5F)
          curveTo(18.784F, 18.0F, 18.0F, 17.216F, 18.0F, 16.25F)
          verticalLineToRelative(-8.5F)
          close()        
      }
    }
    return _videoPlayPause24!!
  }

private var _videoPlayPause24: ImageVector? = null
