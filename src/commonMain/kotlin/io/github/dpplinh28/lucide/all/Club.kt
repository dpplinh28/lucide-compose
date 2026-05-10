package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Club") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.28f, 9.05f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, -10.56f, 0f)
                arcTo(5.5f, 5.5f, 0f, true, false, 12f, 17.66f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 5.28f, -8.6f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 17.66f)
                lineTo(12f, 22f)
            }
}

public val LucideIcons.All.ClubDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Club: ImageVector
    @Composable get() = ClubDefinition.asImageVector()
