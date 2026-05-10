package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pentagon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.83f, 2.38f)
                arcToRelative(2f, 2f, 0f, false, true, 2.34f, 0f)
                lineToRelative(8f, 5.74f)
                arcToRelative(2f, 2f, 0f, false, true, .73f, 2.25f)
                lineToRelative(-3.04f, 9.26f)
                arcToRelative(2f, 2f, 0f, false, true, -1.9f, 1.37f)
                horizontalLineTo(7.04f)
                arcToRelative(2f, 2f, 0f, false, true, -1.9f, -1.37f)
                lineTo(2.1f, 10.37f)
                arcToRelative(2f, 2f, 0f, false, true, .73f, -2.25f)
                close()
            }
}

public val LucideIcons.All.PentagonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pentagon: ImageVector
    @Composable get() = PentagonDefinition.asImageVector()
