package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PhoneHeaderArrowUp24: ImageVector
  get() {
    if (_phoneHeaderArrowUp24 != null) {
      return _phoneHeaderArrowUp24!!
    }
    _phoneHeaderArrowUp24 = fluentIcon(name = "Filled.PhoneHeaderArrowUp24", 24f) {
      materialPath {
          moveTo(15.75F, 2.0F)
          curveTo(16.993F, 2.0F, 18.0F, 3.007F, 18.0F, 4.25F)
          verticalLineToRelative(15.5F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineToRelative(-7.5F)
          curveTo(7.007F, 22.0F, 6.0F, 20.993F, 6.0F, 19.75F)
          verticalLineTo(4.25F)
          curveTo(6.0F, 3.007F, 7.007F, 2.0F, 8.25F, 2.0F)
          horizontalLineToRelative(7.5F)
          close()
          moveToRelative(-1.0F, 2.5F)
          horizontalLineToRelative(-5.5F)
          curveTo(8.836F, 4.5F, 8.5F, 4.836F, 8.5F, 5.25F)
          curveToRelative(0.0F, 0.38F, 0.282F, 0.694F, 0.648F, 0.743F)
          lineTo(9.25F, 6.0F)
          horizontalLineToRelative(5.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          curveToRelative(0.0F, -0.38F, -0.282F, -0.694F, -0.648F, -0.743F)
          lineTo(14.75F, 4.5F)
          close()
          moveToRelative(-2.0F, 6.035F)
          lineToRelative(1.275F, 1.25F)
          curveToRelative(0.296F, 0.29F, 0.77F, 0.286F, 1.06F, -0.01F)
          curveToRelative(0.29F, -0.296F, 0.286F, -0.77F, -0.01F, -1.06F)
          lineToRelative(-2.55F, -2.5F)
          curveTo(12.385F, 8.074F, 12.193F, 7.997F, 11.994F, 8.0F)
          curveToRelative(-0.199F, 0.002F, -0.389F, 0.083F, -0.528F, 0.225F)
          lineToRelative(-2.45F, 2.5F)
          curveToRelative(-0.29F, 0.296F, -0.285F, 0.77F, 0.01F, 1.06F)
          curveToRelative(0.297F, 0.29F, 0.771F, 0.286F, 1.061F, -0.01F)
          lineToRelative(1.164F, -1.187F)
          verticalLineToRelative(3.662F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-3.715F)
          close()        
      }
    }
    return _phoneHeaderArrowUp24!!
  }

private var _phoneHeaderArrowUp24: ImageVector? = null
