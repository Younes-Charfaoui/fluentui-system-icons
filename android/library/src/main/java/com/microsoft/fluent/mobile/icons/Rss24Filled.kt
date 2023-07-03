package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Rss24: ImageVector
  get() {
    if (_rss24 != null) {
      return _rss24!!
    }
    _rss24 = fluentIcon(name = "Filled.Rss24", 24f) {
      materialPath {
          moveTo(6.25F, 3.0F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(6.25F)
          curveTo(21.0F, 4.455F, 19.545F, 3.0F, 17.75F, 3.0F)
          horizontalLineTo(6.25F)
          close()
          moveToRelative(0.5F, 4.5F)
          curveTo(6.345F, 7.5F, 6.0F, 7.183F, 6.0F, 6.778F)
          verticalLineTo(6.723F)
          curveTo(6.0F, 6.33F, 6.305F, 6.002F, 6.698F, 6.0F)
          horizontalLineTo(6.75F)
          curveTo(12.963F, 6.0F, 18.0F, 11.037F, 18.0F, 17.25F)
          verticalLineToRelative(0.052F)
          curveTo(17.998F, 17.695F, 17.67F, 18.0F, 17.277F, 18.0F)
          horizontalLineToRelative(-0.055F)
          curveToRelative(-0.405F, 0.0F, -0.722F, -0.345F, -0.722F, -0.75F)
          curveToRelative(0.0F, -5.385F, -4.365F, -9.75F, -9.75F, -9.75F)
          close()
          moveTo(13.294F, 18.0F)
          horizontalLineToRelative(-0.09F)
          curveToRelative(-0.399F, 0.0F, -0.704F, -0.351F, -0.704F, -0.75F)
          curveToRelative(0.0F, -3.176F, -2.574F, -5.75F, -5.75F, -5.75F)
          curveTo(6.351F, 11.5F, 6.0F, 11.195F, 6.0F, 10.796F)
          verticalLineToRelative(-0.09F)
          curveToRelative(0.0F, -0.38F, 0.287F, -0.701F, 0.666F, -0.705F)
          lineTo(6.75F, 10.0F)
          curveToRelative(4.004F, 0.0F, 7.25F, 3.246F, 7.25F, 7.25F)
          verticalLineToRelative(0.084F)
          curveTo(13.994F, 17.713F, 13.672F, 18.0F, 13.293F, 18.0F)
          close()
          moveTo(7.5F, 18.0F)
          curveTo(6.672F, 18.0F, 6.0F, 17.328F, 6.0F, 16.5F)
          reflectiveCurveTo(6.672F, 15.0F, 7.5F, 15.0F)
          reflectiveCurveTo(9.0F, 15.672F, 9.0F, 16.5F)
          reflectiveCurveTo(8.328F, 18.0F, 7.5F, 18.0F)
          close()        
      }
    }
    return _rss24!!
  }

private var _rss24: ImageVector? = null
