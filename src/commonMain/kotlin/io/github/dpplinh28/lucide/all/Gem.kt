package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gem") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5f, 3f)
                lineTo(8f, 9f)
                lineToRelative(4f, 13f)
                lineToRelative(4f, -13f)
                lineToRelative(-2.5f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 1.6f, .8f)
                lineToRelative(3f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, .013f, 2.382f)
                lineToRelative(-7.99f, 10.986f)
                arcToRelative(2f, 2f, 0f, false, true, -3.247f, 0f)
                lineToRelative(-7.99f, -10.986f)
                arcTo(2f, 2f, 0f, false, true, 2.4f, 7.8f)
                lineToRelative(2.998f, -3.997f)
                arcTo(2f, 2f, 0f, false, true, 7f, 3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 9f)
                horizontalLineToRelative(20f)
            }
}

public val LucideIcons.All.GemDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gem: ImageVector
    @Composable get() = GemDefinition.asImageVector()
