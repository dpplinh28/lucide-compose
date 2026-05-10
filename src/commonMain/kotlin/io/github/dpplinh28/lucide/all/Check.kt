package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Check") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 6f)
                lineTo(9f, 17f)
                lineToRelative(-5f, -5f)
            }
}

public val LucideIcons.All.CheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Check: ImageVector
    @Composable get() = CheckDefinition.asImageVector()
