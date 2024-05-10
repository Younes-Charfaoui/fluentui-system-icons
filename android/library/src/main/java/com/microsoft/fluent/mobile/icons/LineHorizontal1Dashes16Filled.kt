package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LineHorizontal1Dashes16: ImageVector
  get() {
    if (_lineHorizontal1Dashes16 != null) {
      return _lineHorizontal1Dashes16!!
    }
    _lineHorizontal1Dashes16 = fluentIcon(name = "Filled.LineHorizontal1Dashes16", 116f) {
      materialPath {
          moveTo(2.0F, 7.75F)
          curveTo(2.0F, 7.336F, 2.336F, 7.0F, 2.75F, 7.0F)
          horizontalLineToRelative(1.5F)
          curveTo(4.664F, 7.0F, 5.0F, 7.336F, 5.0F, 7.75F)
          reflectiveCurveTo(4.664F, 8.5F, 4.25F, 8.5F)
          horizontalLineToRelative(-1.5F)
          curveTo(2.336F, 8.5F, 2.0F, 8.164F, 2.0F, 7.75F)
          close()
          moveToRelative(4.5F, 0.0F)
          curveTo(6.5F, 7.336F, 6.836F, 7.0F, 7.25F, 7.0F)
          horizontalLineToRelative(1.5F)
          curveTo(9.164F, 7.0F, 9.5F, 7.336F, 9.5F, 7.75F)
          reflectiveCurveTo(9.164F, 8.5F, 8.75F, 8.5F)
          horizontalLineToRelative(-1.5F)
          curveTo(6.836F, 8.5F, 6.5F, 8.164F, 6.5F, 7.75F)
          close()
          moveToRelative(4.5F, 0.0F)
          curveTo(11.0F, 7.336F, 11.336F, 7.0F, 11.75F, 7.0F)
          horizontalLineToRelative(1.5F)
          curveTo(13.664F, 7.0F, 14.0F, 7.336F, 14.0F, 7.75F)
          reflectiveCurveTo(13.664F, 8.5F, 13.25F, 8.5F)
          horizontalLineToRelative(-1.5F)
          curveTo(11.336F, 8.5F, 11.0F, 8.164F, 11.0F, 7.75F)
          close()        
      }
    }
    return _lineHorizontal1Dashes16!!
  }

private var _lineHorizontal1Dashes16: ImageVector? = null
