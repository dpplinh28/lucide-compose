package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shell") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 11f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 8f, 0f)
                arcToRelative(6f, 6f, 0f, false, true, -12f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                arcToRelative(10f, 10f, 0f, true, true, -20f, 0f)
                arcToRelative(11.93f, 11.93f, 0f, false, true, 2.42f, -7.22f)
                arcToRelative(2f, 2f, 0f, true, true, 3.16f, 2.44f)
            }
}

public val LucideIcons.All.ShellDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shell: ImageVector
    @Composable get() = ShellDefinition.asImageVector()
