package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlugZap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.3f, 20.3f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 3.4f, 0f)
                lineTo(12f, 18f)
                lineToRelative(-6f, -6f)
                lineToRelative(-2.3f, 2.3f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 0f, 3.4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 22f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f, 13.5f)
                lineTo(10f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.5f, 16.5f)
                lineTo(13f, 14f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 3f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(6f)
                lineToRelative(-4f, 4f)
            }
}

public val LucideIcons.All.PlugZapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlugZap: ImageVector
    @Composable get() = PlugZapDefinition.asImageVector()
