package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.268f, 21f)
                arcToRelative(2f, 2f, 0f, false, false, 3.464f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 8f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 5f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.002f, 14.464f)
                arcToRelative(9f, 9f, 0f, false, false, .738f, .863f)
                arcTo(1f, 1f, 0f, false, true, 20f, 17f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -.74f, -1.673f)
                curveTo(4.59f, 13.956f, 6f, 12.499f, 6f, 8f)
                arcToRelative(6f, 6f, 0f, false, true, 8.75f, -5.332f)
            }
}

public val LucideIcons.All.BellPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellPlus: ImageVector
    @Composable get() = BellPlusDefinition.asImageVector()
