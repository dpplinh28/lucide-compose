package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IceCreamBowl") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                curveToRelative(5f, 0f, 8f, -2.69f, 8f, -6f)
                horizontalLineTo(4f)
                curveToRelative(0f, 3.31f, 3f, 6f, 8f, 6f)
                moveToRelative(-4f, 4f)
                horizontalLineToRelative(8f)
                moveToRelative(-4f, -3f)
                verticalLineToRelative(3f)
                moveTo(5.14f, 11f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 6.71f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.14f, 11f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 6.71f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5f, 6.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7f, 0f)
            }
}

public val LucideIcons.All.IceCreamBowlDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IceCreamBowl: ImageVector
    @Composable get() = IceCreamBowlDefinition.asImageVector()
