package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Martini") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 22f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 11f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 3f)
                lineToRelative(-7f, 8f)
                lineToRelative(-7f, -8f)
                close()
            }
}

public val LucideIcons.All.MartiniDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Martini: ImageVector
    @Composable get() = MartiniDefinition.asImageVector()
