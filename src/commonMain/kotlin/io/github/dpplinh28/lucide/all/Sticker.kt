package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sticker") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 9f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -.706f, -1.706f)
                lineToRelative(-3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, false, false, 15f, 3f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 3f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 13f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 13f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 16f)
                reflectiveCurveToRelative(.8f, 1f, 2f, 1f)
                curveToRelative(1.3f, 0f, 2f, -1f, 2f, -1f)
            }
}

public val LucideIcons.All.StickerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sticker: ImageVector
    @Composable get() = StickerDefinition.asImageVector()
