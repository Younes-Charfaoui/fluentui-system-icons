package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Reward12: ImageVector
  get() {
    if (_reward12 != null) {
      return _reward12!!
    }
    _reward12 = fluentIcon(name = "Filled.Reward12", 12f) {
      materialPath {
          moveTo(2.25F, 1.0F)
          curveTo(1.56F, 1.0F, 1.0F, 1.56F, 1.0F, 2.25F)
          verticalLineToRelative(1.162F)
          curveToRelative(0.0F, 0.544F, 0.295F, 1.046F, 0.772F, 1.31F)
          lineToRelative(2.876F, 1.599F)
          curveTo(3.67F, 6.815F, 3.0F, 7.829F, 3.0F, 9.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          reflectiveCurveToRelative(3.0F, -1.343F, 3.0F, -3.0F)
          curveToRelative(0.0F, -1.17F, -0.67F, -2.185F, -1.648F, -2.679F)
          lineToRelative(2.877F, -1.598F)
          curveTo(10.704F, 4.458F, 11.0F, 3.956F, 11.0F, 3.412F)
          verticalLineTo(2.25F)
          curveTo(11.0F, 1.56F, 10.44F, 1.0F, 9.75F, 1.0F)
          horizontalLineToRelative(-7.5F)
          close()
          moveTo(5.0F, 5.372F)
          verticalLineTo(2.0F)
          horizontalLineToRelative(2.0F)
          verticalLineToRelative(3.372F)
          lineTo(6.0F, 5.928F)
          lineTo(5.0F, 5.372F)
          close()
          moveTo(8.0F, 9.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          reflectiveCurveToRelative(-2.0F, -0.895F, -2.0F, -2.0F)
          reflectiveCurveToRelative(0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          close()        
      }
    }
    return _reward12!!
  }

private var _reward12: ImageVector? = null
