package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Play") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 5f)
                arcToRelative(2f, 2f, 0f, false, true, 3.008f, -1.728f)
                lineToRelative(11.997f, 6.998f)
                arcToRelative(2f, 2f, 0f, false, true, .003f, 3.458f)
                lineToRelative(-12f, 7f)
                arcTo(2f, 2f, 0f, false, true, 5f, 19f)
                close()
            }
}

public val LucideIcons.All.PlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Play: ImageVector
    @Composable get() = PlayDefinition.asImageVector()
